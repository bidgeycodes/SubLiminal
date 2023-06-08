<!-- ChildComponent -->
<template>
    <div id="add-content">
    <form @submit.prevent="$emit('submit')">
      <label for="postTitle">Post Title:</label>
      <textarea id="postTitle" v-model="localFormData.postTitle"></textarea>

      <label for="postLocation">Post Location:</label>
      <input type="text" id="postLocation" v-model="localFormData.postLocation" required />

      <label for="postDate">Post Date:</label>
      <input type="date" id="postDate" v-model="localFormData.postDate" required />

      <label for="postExist">Does Post Exist?</label>
      <input type="checkbox" id="postExist" v-model="localFormData.postExist" />

      <label for="postDescription">Post Description:</label>
      <textarea id="postDescription" v-model="localFormData.postDescription"></textarea>

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

<style scoped>

#add-content {
  display: flex;
  justify-content: center;
  align-items: center;
}

form > * {
  display: flex;
  flex-direction: column;
  align-content: center;
  align-content: center;
  max-width: 50vw;
  max-height: 50vh;
  padding: 7px 7px 7px 7px;
}

#postName {
  width: 300px;
}

#postDescription {
  width: 400px; /* Adjust the width as per your requirements */
  height: 200px;
  resize: none; /* Allow resizing if needed, options are 'both', 'vertical', 'horizontal', 'none' */
  display: flex;
  align-items: flex-start; /* Ensure items are aligned to the start (left) of the container */
  justify-content: flex-start;
}


</style>