
<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <nav class="nav-wrapper">
      <ul class="nav">
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/about">About</RouterLink>
        <RouterLink to="/addContent">Add Content</RouterLink>
      </ul>
    </nav>
  </header>
  <RouterView />
</template>
