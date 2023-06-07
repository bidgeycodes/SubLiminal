<!-- Parent Component -->
<template>
    <div class="wrapper">
        <div class="post">
            <h3 class="title-text">Title</h3>
            <h4 class="location-text">Location</h4>
            <h3 class="date-text">Date Taken:</h3>
            <PostImagesComponent />
            <p class="description-text">This will be a post description. It will be a lot longer with a "see more" once it reaches its limit.</p>
        </div>
    </div>
</template>

<script>
import PostImagesComponent from './PostImagesComponent.vue';

export default {
    name: 'PostComponent',
    components: {
      PostImagesComponent,
    },
    data() {
    },
}
</script>

<style scoped>

.wrapper {
  display: flex;
  justify-content: center;
  align-content: center;
  min-height: 50vh;
  width: 50vw;
  padding: 1rem;
}

.post {
  display: flex;
  justify-content: center;
  align-items: center;
  display: inline-block;
  background-color: black;
  opacity: 0.75;
  width: 50%;
  padding: 1rem;
}

.title-text {
    font-family: 'Kosugi Maru', sans-serif;
}

.location-text {
    font-family: 'Space Mono', sans-serif;
}

.date-text {
    font-family: 'Space Mono', sans-serif;
}



</style>