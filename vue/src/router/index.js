import { createRouter, createWebHistory } from 'vue-router'
import AboutView from '/views/AboutView.vue'
import App from '/src/App.vue'
import AddContent from '/components/AddContentView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: App
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/',
      name: 'addContent',
      component: () => import('../src/views/AddContentView.vue')
    },
  ]
})

export default router
