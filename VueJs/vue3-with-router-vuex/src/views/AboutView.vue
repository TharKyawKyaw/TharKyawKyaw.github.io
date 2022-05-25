<template>
  <div class="about">
    {{allBoys}}
    <input type="text" v-model="this.$store.state.name">
    <h1>This is an about page</h1>
    <button @click="changeData">Change</button>
  </div>
</template>

<script>
export default {
  data(){

  },
  mounted(){

  },
  methods:{
    getData(){

    },
    storeData(){

    },
    changeData(){
      this.$store.dispatch('change')
    }
  },
  computed:{
    allBoys(){
      return this.$store.getters.boys
      
    }
  }
}
</script>