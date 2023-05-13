
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import TeamManager from "./components/listers/TeamCards"
import TeamDetail from "./components/listers/TeamDetail"

import DataManager from "./components/listers/DataCards"
import DataDetail from "./components/listers/DataDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/teams',
                name: 'TeamManager',
                component: TeamManager
            },
            {
                path: '/teams/:id',
                name: 'TeamDetail',
                component: TeamDetail
            },

            {
                path: '/data',
                name: 'DataManager',
                component: DataManager
            },
            {
                path: '/data/:id',
                name: 'DataDetail',
                component: DataDetail
            },



    ]
})
