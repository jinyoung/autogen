<template>

    <v-card outlined>
        <v-card-title>
            UploadData
        </v-card-title>

        <v-card-text>
            <string offline label="DataName" v-model="value.dataName" :editMode="editMode" @change="change"/>
            <integer offline label="DataSize" v-model="value.dataSize" :editMode="editMode" @change="change"/>
            <string offline label="DataType" v-model="value.dataType" :editMode="editMode" @change="change"/>
            <string offline label="DataLocation" v-model="value.dataLocation" :editMode="editMode" @change="change"/>
            <string offline label="DataPermissions" v-model="value.dataPermissions" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="uploadData"
            >
                UploadData
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
        name: 'UploadDataCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.dataName = {};
            this.value.dataSize = {};
            this.value.dataType = {};
            this.value.dataLocation = {};
            this.value.dataPermissions = {};
        },
        watch: {
        },
        methods: {
            uploadData() {
                this.$emit('uploadData', this.value);
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

