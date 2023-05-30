<template>
    <div class="upload-images">
        <button v-on:click.prevent="uploadImages">Upload Images</button>
    </div>
</template>

<script>
export default {
    data() {
    },
    methods: {
        uploadImages() {
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
                    PostService.uploadImages(result.info.url).then(
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