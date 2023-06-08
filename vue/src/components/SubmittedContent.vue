<!-- ParentComponent -->
<template>
  <div id="submitted-content">
    <AddContent v-model:form-data="formData" @submit.prevent="handleSubmit"></AddContent>

    <div v-if="submitted">
      <h2>Submitted Data:</h2>
      <pre>{{ formData }}</pre>
    </div>
  </div>
</template>
  
<script>
  import PostService from '../services/PostService';
  import AddContent from './AddContent.vue'

  export default {
    components: {
      AddContent,
    },
    data() {
      return {
        formData: {
          postTitle: "",
          postLocation: "",
          postDate: "",
          postExist: "",
          postDescription: "",
        },
        submitted: false,
      };
    },
    methods: {
      handleSubmit() {
        this.submitted = true;
        
      PostService.postNewPost(this.formData).then((response) => {
        if (response.status != 200) {
          alert("unsuccess")
          return;
        } else {
          alert("yep")
          return;
        }
      })
      },
    },
  };
</script>
  
<style scoped>

</style>