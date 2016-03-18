println 'Configure proxy'
pc = new hudson.ProxyConfiguration('proxy.intra.bt.com', 8080)
jenkins.model.Jenkins.instance.proxy = pc
println 'Proxy configured'
