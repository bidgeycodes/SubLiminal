<template>
    <div class="add-images">
        <button v-on:click.prevent="addImages">Upload Images</button>
    </div>
</template>

<script>

import PostService from './services/Postservice.js'

export default {
    data() {
    },
    methods: {
        addImages() {
        window.cloudinary
            .openUploadWidget(
            {
                cloud_name: "dhneofixj",
                upload_preset: "ml_default",
            },
            (error, result) => {
                if (!error && result && result.event === "success") {
                    console.log("Done uploading..: ", result.info.url);

                    // Send the uploaded image URL to the backend
                    PostService.addImages(result.info.url).then(
                        (response) => {
                        if (response.status != 200) {
                            //TODO: error
                            return;
                        }

                  // Set the newly uploaded photo
                  this.postImageUrl = result.info.url;
                }
              );
            }
          }
        )
        .open();
    },
  },
};
</script>