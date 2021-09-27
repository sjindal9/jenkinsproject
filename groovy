import jenkins.*;
import jenkins.model.*;
import hudson.*;
import hudson.model.*;


def target = binding.variables["target"];
def svr = Jenkins.instance;
def job=svr.getJob(target);

println(job);

def sched = job.scheduleBuild2(0);

sched.get();
