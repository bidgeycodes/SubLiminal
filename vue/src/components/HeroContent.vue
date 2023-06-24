<template>
    <div class="hero-content">
        <div class="hero-content-child">
            <LogoTitle />
            <PostViewDropdown />
        </div>
    </div>

</template>

<script>
import LogoTitle from './LogoTitle.vue';
import PostViewDropdown from './PostViewDropdown.vue';

export default {
  name: 'HeroContent',
  components: {
    LogoTitle,
    PostViewDropdown
  },
};

</script>

<style scoped>
    .hero-content {
        position: fixed;
        width: 100vw;
        z-index: 10000;
        top: 0;
        background-image: url('src/assets/background2.jpg');
        background-size: 102vw 104vh;
    }
    .hero-content-child {
        margin-left: auto;
        margin-right: auto;
    }
</style>