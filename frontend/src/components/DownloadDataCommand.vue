<template>

    <v-card outlined>
        <v-card-title>
            DownloadData
        </v-card-title>

        <v-card-text>
            <string offline label="DataId" v-model="value.dataId" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="downloadData"
            >
                DownloadData
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
        name: 'DownloadDataCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.dataId = {};
        },
        watch: {
        },
        methods: {
            downloadData() {
                this.$emit('downloadData', this.value);
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

