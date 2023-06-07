import axios from 'axios';

export default {

    getAllPosts() {
        return axios.get('/posts');
    },

    getPost(id){
        return axios.get(`/posts/post/${id}`);
    },

    
    
}
