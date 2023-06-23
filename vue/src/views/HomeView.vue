<template>
  <div class="home-view">
    <NavComponent />
    <LogoTitle class="fixed fixed-logo-title" />
    <PostViewDropdown class="fixed fixed-post-view-dropdown" />
        <div class="post-wrapper">
         <div class="post-container" v-for="(post, index) in posts" :key="index">
          <PostComponent v-bind:post-data="post"/>
        </div>
      </div>
  </div>
</template>

<script>
import NavComponent from '../components/NavComponent.vue';
import LogoTitle from '../components/LogoTitle.vue';
import PostViewDropdown from '../components/PostViewDropdown.vue';
import PostComponent from '../components/PostComponent.vue';
import PostService from '../services/PostService';

export default {
  components: {
    PostViewDropdown,
    PostComponent,
    LogoTitle,
    NavComponent,
},
  methods: {
    fetchPostData() {
    PostService.getAllPosts()
      .then(response => {
        this.posts = response.data
      })
      .catch(error => {
        console.error('Error fetching post data:', error);
      });
    },
  },
  created() {
    this.fetchPostData()
  },
  data() {
    return {
      posts: [],
    };
  },
}

</script>

<style scoped>

.fixed {
  position: fixed;
  left: 0;
  z-index: 100;
}

.fixed-logo-title {
  top: 0;
}

.fixed-post-view-dropdown {
  top: 60px;
}

.post-wrapper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.post-container {
  display: flex;
  justify-content: center;
  background-color: black;
  margin: 1rem;
  opacity: 0.75;
  width: 45%;
  border: solid transparent;
  background-clip: padding-box;
}

</style>