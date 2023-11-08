// 此文件专门负责项目的路由

import VueRouter from "vue-router"

// 引入组件
import Login from '@/components/Login.vue'
import Register from "@/components/Register.vue";
import Home from "@/components/Home.vue";


// 创建并暴露一个路由器
export default new VueRouter({
    mode: 'history',    // 路由模式，该模式不会在地址中显示井号#
    routes: [
        {
            path: '/',          // 路径
            redirect: '/login'  // 重定向
        },
        {
            path: '/login',     // 路径
            component: Login    // 跳转到的组件
        },
        {
            path: '/register',     // 路径
            component: Register    // 跳转到的组件
        },
        {
            path: '/home',     // 路径
            component: Home    // 跳转到的组件
        }
    ]
})