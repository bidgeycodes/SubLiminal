<template>
  <div class="dropdown-wrapper">
    <div class="dropdown">
      <label for="order-selector">Order entries by: </label>
      <select id="order-selector" v-model="orderSelector">
        <option value="descending">Descending</option>
        <option value="ascending">Ascending</option>
        <option value="byLocation">By Location</option>
      </select>
    </div>
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

  .dropdown-wrapper {
    display: flex;
    justify-content: center;
    gap: 0.5em;
    padding-bottom: 8vh;
  }

  </style>