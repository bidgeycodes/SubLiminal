<!-- ChildComponent -->
<template>
  <div id="add-content">
    <form @submit.prevent="$emit('submit')">
      <label for="postName">Post Name:</label>
      <input type="text" id="postName" v-model="localFormData.postName" required />

      <label for="postLocation">Post Location:</label>
      <input type="text" id="postLocation" v-model="localFormData.postLocation" required />

      <label for="postDate">Post Date:</label>
      <input type="text" id="postDate" v-model="localFormData.postDate" required />

      <label for="postDescription">Post Description:</label>
      <input type="text" id="postDescription" v-model="localFormData.postDescription" required />

      <button type="submit">Submit</button>
    </form>
  </div>
</template>

<script>
  export default {
    props: {
      formData: {
        type: Object,
        required: true,
      },
    },
    computed: {
      localFormData: {
        get() {
          return this.formData;
        },
        set(val) {
          this.$emit("update:formData", val);
        },
      },
    },
  };
</script>