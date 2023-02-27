import {RouteRecordRaw, createRouter, createWebHashHistory} from 'vue-router';

// @ts-ignore
// @ts-ignore
const routes: RouteRecordRaw[] = [
    {
        path: '/',
        name: 'Home',
        component: () => import('../views/Home.vue')
    },
    //TODO: Add client routes here
    {
        path: '/about',
        name: 'About',
        component: () => import('../../src/views/About.vue')
    },

    {
        path: '/contact',
        name: 'Contact',
        component: () => import('../../src/views/Contact.vue')
    },
    {
        path: '/profile',
        name: 'Profile',
        component: () => import('../../src/views/Profile.vue')
    },
    //TODO: Add admin routes here
    {
        path: '/admin',
        name: 'Admin',
        component: () => import('../admin/views/Login.vue')
    },
    {
        path: '/:pathMatch(.*)*',
        name: 'NotFound',
        component: () => import('../views/NotFound.vue')
    }
    //TODO: Add admin routes here


];

const router = createRouter({
    history: createWebHashHistory(),
    routes
});

export default router;
