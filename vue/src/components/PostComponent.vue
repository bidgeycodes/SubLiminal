<!-- Parent Component -->
<template>
        <div class="post">
            <h3 class="title-text" v-bind:title="postTitle">{{ postTitle }}</h3>
            <h4 class="location-text" v-bind:location="postLocation">{{ postLocation }}</h4>
            <h3 class="date-text" v-bind:date="postDate">{{ postDate }}</h3>
            <h2 class="exist-text" v-bind:exist="postExist">{{ postExist }}</h2>
            <PostImagesComponent />
            <p class="description-text" v-bind:description="postDescription">{{ postDescription }}</p>
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