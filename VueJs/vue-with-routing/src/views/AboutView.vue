<template>
  <div class="about">
    <h1>This is an about page</h1>

    <div class="row">
      <div class="col-md-3 col-sm-4 col-6 my-2" v-for="(country,index) in countries" :key="index">
        <div class="card">
          <img :src="country.flags.png" class="card-img-top" alt="IMG">
          <div class="card-body">
            <h5 class="card-title">{{country.name.common}}</h5>
            <router-link :to="{ name: 'detail',params: { name: country.name.common}}" class="btn btn-info">Detail</router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>



<script>
const axios = require('axios').default;
export default {
 data(){
    return{
      countries: "",
    }
  },
  mounted(){
    axios.get('https://restcountries.com/v3.1/all')
    .then(response => {
      this.countries = response.data
    })
  } 
}
</script>