import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';//引入element-ui
import 'element-ui/lib/theme-chalk/index.css';
import VueRouter from 'vue-router' ;
import router from './router';
import VueAxios from 'vue-axios';
import axios from "axios";

Vue.config.productionTip = false

Vue.use(ElementUI)
Vue.use(VueRouter)
Vue.use(VueAxios,axios)

//以下创建了一个Vue实例，用于渲染应用的内容。
//render是一个函数，用于渲染Vue实例的内容。它接受一个参数 h，用于创建虚拟DOM的函数（createElement）。
//router来处理前端路由
//$mount 是Vue实例的方法，它用于将Vue实例挂载到DOM元素上。
//#app 是一个CSS选择器，它指定了DOM元素的位置，该元素将成为Vue实例的根元素，Vue应用将在这个元素内渲染。
//以上两行简述：Vue实例被挂载到 index.html 中的ID为 "app" 的DOM元素（ div 标签）上，以启动应用。
new Vue({
  render: h => h(App),
  router
}).$mount('#app')
