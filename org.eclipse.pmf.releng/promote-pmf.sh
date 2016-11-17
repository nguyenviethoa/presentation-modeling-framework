#!/bin/bash
target=release-0.10.0
directory="`date +%d-%m-%y-%H-%M`"
mv /home/data/httpd/download.eclipse.org/pmf/updates /home/data/httpd/archive.eclipse.org/pmf/$directory

rm /home/data/users/yvyang/promote/temp/site.p2.zip
rm -rf /home/data/users/yvyang/promote/temp/site.p2

cd /home/data/users/yvyang/promote/temp
wget --no-check-certificate "https://hudson.eclipse.org/hudson/job/PMF-1.0-kepler/lastSuccessfulBuild/artifact/site.p2.zip"

#...
# sign our zip
#...

unzip site.p2.zip
rm -rf /home/data/httpd/download.eclipse.org/pmf/$target/
mkdir /home/data/httpd/download.eclipse.org/pmf/$target/
cp -r /home/data/users/yvyang/promote/temp/site.p2/* /home/data/httpd/download.eclipse.org/pmf/$target/
cp site.p2.zip /home/data/httpd/download.eclipse.org/pmf/$target/pmf-archived-p2-site.zip

echo '
<!DOCTYPE html>
<html>
<head>
  <title>PMF Update Site (Incubation)</title>
</head>

<body style="font-family:Arial; font-size:small;">
<h1>PMF Update Site (Incubation)</h1>
<p>
<em>For information about PMF, visit its <a href="http://www.eclipse.org/PMF">homepage</a> or <a
href="http://wiki.eclipse.org/PMF">wiki</a>.
         <br> For information about installing or updating Eclipse software, see the
         <a href="http://help.eclipse.org/helios/index.jsp?topic=/org.eclipse.platform.doc.user/tasks/tasks-124.htm">
           Eclipse Platform Help</a>.
</p>
<h3>Contents</h3>
<ul>
<li><a href="#">...</a></li>
</ul>
<p>
<a href="pmf-archived-p2-site.zip">Download the zipped PMF p2 site</a>
</p>
</body>
</html>
' > /home/data/httpd/download.eclipse.org/pmf/$target/index.html

cp -ar /home/data/httpd/download.eclipse.org/pmf/$target /home/data/httpd/download.eclipse.org/pmf/updates
