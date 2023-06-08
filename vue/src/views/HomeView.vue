<template>
    <header>
      <h1>Sub<em>Liminal</em></h1>
      <h2>ちょうげんじつしゅぎてき</h2>
    </header>
    <div class="dropdown-container">
    <PostViewDropdown />
    </div>
    <div class="post-wrapper">
      <div class="post-container" v-for="(post, index) in posts" :key="index">
        <PostComponent v-bind:post-data="post"/>
      </div>
    </div>
</template>

<script>
import PostViewDropdown from '../components/PostViewDropdown.vue';
import PostComponent from '../components/PostComponent.vue';
import PostService from '../services/PostService';

export default {
  components: {
    PostViewDropdown,
    PostComponent,
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
header {
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-content: flex-start;
  display: inline-block;
  width: 100%;
  padding-bottom: -8vh;
}

h1, h2 {
  display: flex;
  justify-content: center;
  margin-bottom: 0;
}

h1 {
  font-size: 6em;
  font-weight: bold;
  letter-spacing: 2.5vw;
  margin-top: -0.5vh;
}

h2 {
  font-family: 'Tsukimi Rounded', sans-serif;
  font-size: 1.75em;
  letter-spacing: 1vw;
  margin-top: -4vh;
  color: #b4c0b6;
  z-index: 1;
}

.dropdown-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 10vh;
  width: 100%;
}

.post-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  height: auto;
  width: 100%;
}

.post-container {
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: black;
  opacity: 0.75;
  width: 50%;
  padding: 1rem;
}



</style>