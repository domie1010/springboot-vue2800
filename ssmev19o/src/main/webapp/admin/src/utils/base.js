const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmev19o/",
            name: "ssmev19o",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmev19o/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "深加工农产品推广服务平台"
        } 
    }
}
export default base
