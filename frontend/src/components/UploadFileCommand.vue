<template>

    <v-card outlined>
        <v-card-title>
            UploadFile
        </v-card-title>

        <v-card-text>
            <string offline label="FileName" v-model="value.fileName" :editMode="editMode" @change="change"/>
            <integer offline label="FileSize" v-model="value.fileSize" :editMode="editMode" @change="change"/>
            <string offline label="FileType" v-model="value.fileType" :editMode="editMode" @change="change"/>
            <string offline label="FileLocation" v-model="value.fileLocation" :editMode="editMode" @change="change"/>
            <string offline label="FilePermissions" v-model="value.filePermissions" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="uploadFile"
            >
                UploadFile
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
        name: 'UploadFileCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.fileName = {};
            this.value.fileSize = {};
            this.value.fileType = {};
            this.value.fileLocation = {};
            this.value.filePermissions = {};
        },
        watch: {
        },
        methods: {
            uploadFile() {
                this.$emit('uploadFile', this.value);
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

