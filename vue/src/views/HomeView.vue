<template>
  <div class="home-view">
    <HeroContent />
    <div class="post-wrapper">
      <div class="post-container" v-for="(post, index) in posts" :key="index">
        <PostComponent v-bind:post-data="post" />
      </div>
    </div>
  </div>
</template>

<script>
import PostComponent from '../components/PostComponent.vue'
import HeroContent from '../components/HeroContent.vue'
import PostService from '../services/PostService'

export default {
  components: {
    PostComponent,
    HeroContent
  },
  methods: {
    fetchPostData() {
      PostService.getAllPosts()
        .then((response) => {
          this.posts = response.data
        })
        .catch((error) => {
          console.error('Error fetching post data:', error)
        })
    }
  },
  created() {
    this.fetchPostData()
  },
  data() {
    return {
      posts: []
    }
  }
}
</script>

<style scoped>
.post-wrapper {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin-top: 300px;
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
