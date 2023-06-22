<!-- Parent Component -->
<template>
        <div class="post">
            <h3 class="title-text" v-bind:title="postTitle">{{ postData.postTitle }}</h3>
           <div class="location-date-text">
            <h4 class="location-text" v-bind:location="postLocation">{{ postData.postLocation }}</h4>
            <h3 class="date-text" v-bind:date="postDate">{{ postData.postDate }}</h3>
           </div>
            <h2 class="exist-text" v-bind:exist="postExist">{{ postData.postExist }}</h2>
            <PostImagesComponent />
            <p class="description-text" v-bind:description="postDescription">{{ postData.postDescription }}</p>
        </div>
</template>

<script>
import PostImagesComponent from './PostImagesComponent.vue';

export default {
    name: 'PostComponent',
    components: {
      PostImagesComponent,
    },
    props: {
        postData: {
            type: Object,
                postTitle: "",
                postLocation: "",
                postDate: "",
                postExist: "",
                postDescription: "",
            },
        },
    data() {
    },
};

</script>

<style scoped>

.post {
    width: 100%;
    justify-content: center;
}

.location-date-text {
    display: flex;
    justify-content: center;
    width: 100%;
    gap: 5rem;
}

.title-text {
    font-family: 'Kosugi Maru', sans-serif;
    margin-top: 0.75rem;
    margin-left: 2rem;
    margin-bottom: 0.75rem;
    text-transform: uppercase;
    letter-spacing: 0.35vw;
    font-size: 1.5em;
}

.location-text {
    font-family: 'Space Mono', sans-serif;
    margin: 0;
}

.date-text {
    font-family: 'Space Mono', sans-serif;
    margin: 0;
}
.exist-text {
    display: flex;
    flex-direction: row-reverse;
    margin: 0;
}

</style>