<template>
  <div>
    <h2>欢迎{{ user.username }}！您的 id 为{{ user.user_id }}</h2>
    <router-link to="/login">
      <el-button> 登出 </el-button>
    </router-link>
  </div>
</template>

<script>
export default {
  data() {
    return {
      user: {
        username: "",
        user_id: null,
      },
    };
  },
};
</script>

<style scoped>
</style>