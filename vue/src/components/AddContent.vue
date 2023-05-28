<!-- ChildComponent.vue -->
<template>
  <div id="add-content">
    <form @submit.prevent="handleSubmit">
      <label for="postName">Post Name:</label>
      <input type="text" id="postName" v-model="formData.postName" required />

      <label for="postLocation">Post Location:</label>
      <input type="text" id="postLocation" v-model="formData.postLocation" required />

      <label for="postDate">Post Date:</label>
      <input type="text" id="postDate" v-model="formData.postDate" required />

      <label for="postDescription">Post Desctiption:</label>
      <input type="text" id="postDescripton" v-model="formData.postDescripton" required />

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
};
</script>
