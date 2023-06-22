<template>
    <div class="logo-wrapper">
      <h1>Sub<em>Liminal</em></h1>
      <h2>ちょうげんじつしゅぎてき</h2>
    </div>
</template>

<script>

export default {
  name: 'LogoTitle',
  components: {
  },
};

</script>

<style scoped>

.logo-wrapper {
  display: flex;
  justify-content: center;
  flex-direction: column;
  width: 100%;
  overflow-y: auto;
  z-index: 0;
}

h1, h2 {
  display: flex;
  justify-content: center;
  margin-bottom: 0;
}

h1 {
  padding-top: 6vh;
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
  padding-bottom: 4vh;
}

</style>