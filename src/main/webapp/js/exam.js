$(document).ready(function(){
    // 暂存返回的数据；
    var num=1;//初始时题号
    var datas=null;
    var content=$("#shitiContainer");
    $("#next").click(function(){
        num++;
        ajax(content,num);
    });
    $.post("subject/gettest",{"s_type":"c1_1","method":"shunxu","id":num},function(data){
        datas=data;
        loadQuestions(content,datas,num);
    },"json");
    $("#pre").click(function(){
        if(num<=1){
            alert("当前为第一题！");
            return;
        }
        else{
            num--;
            ajax(content,num);
        }  
    });
    /*点击“答案解析”，切换*/
    $("#showAnswer").bind({
        click:function (){ 
                var target=$("#explainWarp");
                var currentStyle=$("#explainWarp").css("display");
                var that=this;
                tab(that,target,currentStyle);
            }
    });
});
function ajax(content,num){
    $.post("subject/gettest",{"s_type":"c1_1","method":"shunxu","id":num},function(data){
        datas=data;
        loadQuestions(content,datas,num);
    },"json");
}
// 加载题目及选项
function loadQuestions(content,datas,num){
    content.children(".shiti_question").html(num+"/500"+datas.s_title);
    content.find("pre:eq(0)").html(datas.answer_a);
    content.find("pre:eq(1)").html(datas.answer_b);
    content.find("pre:eq(2)").html(datas.answer_c);
    content.find("pre:eq(3)").html(datas.answer_d);
    $(".explain").html(datas.jiexi);
}
// 切换
function tab(that,target,currentStyle){
    if(currentStyle=="none"){
        target.show();
    }
    else{
        target.hide();
    }  
}