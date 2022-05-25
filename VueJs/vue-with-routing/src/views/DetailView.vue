<template>
    <div class="detail">
        <h2>Country Detail Page</h2>
        <div class="card mb-3" style="max-width: 540px;">
            <div class="row g-0">
                <div class="col-md-4">
                    <img :src="country[0].flags.png" class="img-fluid rounded-start" alt="">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">{{country[0].name.common}}</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
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
            country: "",
        }
    },
    mounted(){
        let name = this.$route.params.name;
        axios.get("https://restcountries.com/v3.1/name/"+name)
        .then(response => {
            this.country = response.data
        })
    }
}
</script>