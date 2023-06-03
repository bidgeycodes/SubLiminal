
<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
    <nav class="nav-wrapper">
      <ul class="nav">
        <li><RouterLink to="/">Home</RouterLink></li>
        <li><RouterLink to="/about">About</RouterLink></li>
        <li><RouterLink to="/addContent">Add Content</RouterLink></li>
      </ul>
    </nav>
  <RouterView />
</template>

<style scoped>

body {
  background-image: url('/assets/background1.jpg');
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
}

.nav-wrapper {
  display: flex;
  flex-direction: row;
  justify-content: flex-end;
  height: auto;
}
.nav {
  font-family: 'Space Mono', monospace;
  text-transform: uppercase;
  list-style: none;
}

li {
  display: inline-block;
  margin-right: 1vw;
  font-size: 1em;
}

</style>