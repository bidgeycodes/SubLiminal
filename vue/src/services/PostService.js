import axios from 'axios';

const BASE_URL = "http://localhost:8080"

export default {

    getAllPosts() {
        return axios.get(`${BASE_URL}/posts`);
    },

    getPost(id){
        return axios.get(`${BASE_URL}/posts/post/${id}`);
    },

    postNewPost(formData) {
        return axios.post(`${BASE_URL}/posts`, formData);
    }

}
