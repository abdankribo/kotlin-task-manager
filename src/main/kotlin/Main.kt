data class Task(val id:Int,val title:String,val priority:Int,var done:Boolean=false)
class TaskManager{private val tasks=mutableListOf(Task(1,"Build portfolio",3),Task(2,"Review README",2));fun add(t:String,p:Int){tasks+=Task((tasks.maxOfOrNull{it.id}?:0)+1,t,p)};fun list(){tasks.sortedByDescending{it.priority}.forEach{println("#"+it.id+" ["+(if(it.done)"x" else " ")+"] P"+it.priority+" "+it.title)}};fun complete(id:Int){tasks.find{it.id==id}?.done=true}}
fun main(){val m=TaskManager();m.add("Ship Batch 4",3);m.complete(1);println("TASK MANAGER");m.list()}
