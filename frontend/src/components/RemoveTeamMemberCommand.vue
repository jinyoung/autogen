<template>

    <v-card outlined>
        <v-card-title>
            RemoveTeamMember
        </v-card-title>

        <v-card-text>
            <string offline label="TeamId" v-model="value.teamId" :editMode="editMode" @change="change"/>
            <string offline label="TeamMember" v-model="value.teamMember" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="removeTeamMember"
            >
                RemoveTeamMember
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
        name: 'RemoveTeamMemberCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.teamId = {};
            this.value.teamMember = {};
        },
        watch: {
        },
        methods: {
            removeTeamMember() {
                this.$emit('removeTeamMember', this.value);
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

