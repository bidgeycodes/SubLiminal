<script setup>
import { RouterLink,  } from 'vue-router'
</script>

<template>
    <nav>
      <div class="nav-content">
        <ul class="site-nav">
          <li><RouterLink to="/">Home</RouterLink></li>
          <li><RouterLink to="/about">About</RouterLink></li>
          <li><RouterLink to="/addContent">Gallery</RouterLink></li>
        </ul>
      </div>
    </nav>
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
  position: fixed;
  top: 0;
  width: 100vw;
}
.nav-content {
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    font-family: 'Space Mono', monospace;
    text-transform: uppercase;
    list-style: none;
    overflow-y: auto;
    width: 100%;
    height: 4vh;
  }
  
 
  
  li {
    display: inline-block;
    margin-right: 1.5vw;
    font-size: 1em;
  }
  
  </style>