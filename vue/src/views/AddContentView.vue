<template>
  <div id="add-content">
    <p class="text-content">Add content to database:</p>
    <SubmittedContent />
  </div>
</template>

<script>
import SubmittedContent from '../components/SubmittedContent.vue';

export default {
  components: {
    SubmittedContent,
  },
};
</script>

<style scoped>

#add-content{
  display: flex;
  justify-content: center;
  flex-direction: column;
}

.text-content {
  display: flex;
  justify-content: center;
  font-size: 4em;
  margin-bottom: 2%;
}

</style>

