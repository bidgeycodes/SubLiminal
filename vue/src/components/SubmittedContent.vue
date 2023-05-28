<!-- ParentComponent -->
<template>
    <div class="submitted-content">
      <form-component :form-data="formData" @submit="handleSubmit"></form-component>
      <div v-if="submitted">
        <h2>Submitted Data:</h2>
        <pre>{{ formData }}</pre>
      </div>
    </div>
  </template>
  
  <script>  
  export default {
    components: {
      FormComponent,
    },
    data() {
      return {
        formData: {
          postName: "",
          postLocation: "",
          postDate: "",
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
  