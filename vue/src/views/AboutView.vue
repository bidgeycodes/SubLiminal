<template>
  <div class="about-container">
    <h2>About</h2>
    <h3>あばうと</h3>
  </div>
  <div class="page-container">
    <div class="image-container">
    <img src="@/assets/IMG_5149.jpg" class="img">
    </div>
      <div class="text-container">
        <p class="text">I am a software engineer based in Columbus, Ohio. My fascination with forlorn, haunting, and deserted spaces began
        as a child growing up in abandoned mill towns that freckle the New England landscape. Being in such presences stirred something within me;
        feelings of apprehension and uneasiness, but also a surreal and comforting aura. It wasn't until I encountered the concept of a <span class="liminal">
        liminal space </span> that I could put a name to these enigmatic experiences. I had been straddling the metaphysical boundary between the
        familiar yet unfamiliar, the temporality of time and space, the abandoned past and an unknown future.</p>
        <p class="text">The images in this collection are years worth of encounters in spaces unsettling enough for me to reach for my phone and
        document them. All images were captured very unprofessionally via an iPhone camera, without editing by yours truly unless otherwise
        noted.</p>
        <p class="text">Thank you to everyone who pushed me and supported me in this project, especially those who said, "yeah, that seems cool."</p>
      </div>
    </div>
</template>

<style scoped>

.about-containter {
  max-width: 40%;
  height: auto;
}

h2 {
  font-size: 4em;
  margin-left: 5vw;
  letter-spacing: 2.5vw;
  margin-bottom: 0;
}

h3 {
  font-family: 'Tsukimi Rounded', sans-serif;
  font-size: 1.75em;
  color: #486059;
  margin-left: 7.7vw;
  letter-spacing: 2.5vw;
  margin-top: -3vh;
  z-index: 1;
}

.page-container {
  display: flex;
  justify-content: center;
  flex-direction: row-reverse;
  align-items: center;
  align-content: center;
  width: 100%;
}

.image-container {
  width: 500px;
  height: 500px;
}

.img {
  width: 500px;
  height: 480px;
  border: 10px solid black;
}

.text-container {
  width: 500px;
  height: 480px;
  background-color: black;
  border: 10px solid black;
}

.text {
  font-size: 1.27em;
}

.liminal {
  font-style: italic;
  color:#486059;
}

</style>
