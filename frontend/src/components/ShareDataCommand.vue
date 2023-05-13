<template>

    <v-card outlined>
        <v-card-title>
            ShareData
        </v-card-title>

        <v-card-text>
            <string offline label="DataId" v-model="value.dataId" :editMode="editMode" @change="change"/>
            <string offline label="DataPermissions" v-model="value.dataPermissions" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="shareData"
            >
                ShareData
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ShareDataCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.dataId = {};
            this.value.dataPermissions = {};
        },
        watch: {
        },
        methods: {
            shareData() {
                this.$emit('shareData', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

