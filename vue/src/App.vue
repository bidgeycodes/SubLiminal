<template>
  <NavComponent />
  <RouterView />
</template>

<script>
import NavComponent from './components/NavComponent.vue';
import PostService from './services/PostService';

export default {
  components: {
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


</style>