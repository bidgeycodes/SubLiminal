<template>
    <div>
      <label for="order-selector">Order entries by: </label>
      <select id="order-selector" v-model="orderSelector">
        <option value="descending">Descending</option>
        <option value="ascending">Ascending</option>
        <option value="byLocation">By Location</option>
      </select>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        orderSelector: "descending",
      };
    },
  };
  </script>

  <style scoped>

    #order-selector {
      padding: 0.5vh, 0.5vh, 0.5vh, 0.5vh;
    }

  </style>