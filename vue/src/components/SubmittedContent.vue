<!-- ParentComponent -->
<template>
  <div class="submitted-content">
    <AddContent v-model:form-data="formData" @submit="handleSubmit"></AddContent>

    <div v-if="submitted">
      <h2>Submitted Data:</h2>
      <pre>{{ formData }}</pre>
    </div>
  </div>
</template>
  
<script>
  import AddContent from './AddContent.vue'

  export default {
    components: {
      AddContent,
    },
    data() {
      return {
        formData: {
          postName: "",
          postLocation: "",
          postExist: "",
          date: "",
          postDescription: "",
        },
        submitted: false,
      };
    },
    methods: {
      handleSubmit() {
        this.submitted = true;
      },
    },
  };
</script>
  