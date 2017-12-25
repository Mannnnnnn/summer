var menuItem = Vue.extend({
    name: 'menu-item',
    props: {item: {}},
    template: [
        '<li class="layui-nav-item">',
        '<a class="" href="javascript:" v-if="item.type==0">{{item.name}}</a>',
        '<dl class="layui-nav-child"  v-for="item in item.children">',
        '<dd><a :href="\'#\'+item.url">{{item.name}}</a></dd>',
        '</dl>',
        '</li>'
    ].join('')
});
//注册菜单组件
Vue.component('menu-item', menuItem);

var vm = new Vue({
    el: '#app',
    data: {
        menuList: [{
            id: 1,
            parendId: 0,
            name: "",
            type: 0,
            children: {
                id: 2,
                parendId: 1,
                name: "管理者视图",
                type: 1,
                url: "stats/index.html"
            }
        }],
        main: 'main.html'
    },
    methods: {
        getMenuList: function () {
            axios.get('/test/1', {
                params: {
                    ID: 12345
                }
            })
                .then(function (response) {
                    vm.menuList=response.data.menuList;
                    console.log(vm.menuList);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }

    },
    created: function (data) {
        this.getMenuList();

    },
    updated: function () {
        //路由
        var router = new Router();
        routerList(router, vm.menuList);
        router.start();
    }

});

function routerList(router, menuList) {
    for (var key in menuList) {
        var menu = menuList[key];
        if (menu.type === 0) {
            if (menu.children!=null &&menu.children.length>0){
                for(var childkey in menu.children){
                    var childmenu = menu.children[childkey];
                    router.add('#' + childmenu.url, function () {
                        var url = window.location.hash;
                        //替换iframe的url
                        vm.main = url.replace('#', '');

                    });
                }
            }else{
                routerList(router, menu.list);
            }
        }
    }
}
