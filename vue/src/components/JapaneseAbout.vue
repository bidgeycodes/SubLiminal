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
            <p class="text">私はオハイオ州のコロンバス市に本拠地のソフトウェア開発者。あちこちニューイングランドに散らばって廃墟となった紙工場の街に住んでいて成長した子供として孤独、陰鬱、
          心細いスペースで興味が始まった。こんなスペースにいる場合は気心の中に物を感じさせて、たとえば心配や気が進まない感じけど、超現実的な慰めのオーラー。「<span class="liminal">リミナルスペース</span>」
          という概念を学んだ後だけでこんな不可解な経験が分かり始めた。形而上の境界の間を見つけられ、熟知らしい物も不慣れな物もあり、空間と時を超越し、廃墟となった過去のところに不透明な将来。感じが不安させられば
          させられるほど、瞬間を記録きたくなる。</p>

          <p class="text">この写真はiPhoneのカメラだけで撮ってたくさん年をかかって集められるので、質が高いではないでしょう。編集なしあって、はっきりに確認した場合を除いて全ての写真が私で撮った。</p>

          <p class="text">みんなさんはこのプロジェクトを支持して手伝ってありがとうございました。特に「うん、面白いみたい」と言った人。</p>
        </div>
    </div>
</template>

<script>

</script>


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
  font-size: 1.20em;
  line-height: 2.60vh;
}

.liminal {
  font-style: italic;
  color: #a6b688;
}

</style>