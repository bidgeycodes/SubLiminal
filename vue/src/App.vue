
<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div class="nav-wrapper">
    <nav>
      <ul class="site-nav">
        <li><RouterLink to="/">Home</RouterLink></li>
        <li><RouterLink to="/about">About</RouterLink></li>
        <li><RouterLink to="/addContent">Gallery</RouterLink></li>
      </ul>
    </nav>
  </div>
  <RouterView />
</template>

<style scoped>

/* body {
  background-image: url('/assets/background1.jpg');
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
} */

nav {
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  height: auto;
  font-family: 'Space Mono', monospace;
  text-transform: uppercase;
  list-style: none;
  overflow-y: auto;
}

.site-nav {
  position: fixed;
}

li {
  display: inline-block;
  margin-right: 1.5vw;
  font-size: 1em;
}

</style>