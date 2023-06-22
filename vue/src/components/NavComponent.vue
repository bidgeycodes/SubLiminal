<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
    <nav>
      <ul class="site-nav">
        <li><RouterLink to="/">Home</RouterLink></li>
        <li><RouterLink to="/about">About</RouterLink></li>
        <li><RouterLink to="/addContent">Gallery</RouterLink></li>
      </ul>
    </nav>
  <RouterView />
</template>

<script>
export default {
  name: 'NavComponent',
  components: {
  },
};
</script>


<style scoped>

nav {
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    font-family: 'Space Mono', monospace;
    text-transform: uppercase;
    list-style: none;
    overflow-y: auto;
    width: 100%;
  }
  
  .site-nav {
    position: fixed;
    height: 4vh;
  }
  
  li {
    display: inline-block;
    margin-right: 1.5vw;
    font-size: 1em;
  }
  
  </style>