# CS2261-JAVA
# Usefull links:

#Track a new remote branch created on GitHub
#https://stackoverflow.com/questions/11262703/track-a-new-remote-branch-created-on-github

#What is the best (and safest) way to merge a Git branch into master?
#git checkout master
#git pull origin master
#git merge test
#git push origin master

# Steps for recording 
#Script <file1Name>
#cat <javaName.java>
#javac <javaName.java>
#java <javaName>
  
# Push a new local branch to a remote Git repository and track it too  
#Create a new branch:
#git checkout -b feature_branch_name
#edit, add and commit your files.
#Push your branch to the remote repository:
#git push -u origin feature_branch_name

# Merge to master
#git checkout master 
#git merge development
#git push -u origin master 

# How do I delete a Git branch both locally and remotely?
#git push --delete <remote_name> <branch_name>
#git branch -d <branch_name>
#Note that in most cases the remote name is origin.

#To delete the local branch use one of the following:

#git branch -d branch_name
#git branch -D branch_name

# Track a new remote branch created on GitHub
#git fetch
#git branch --track branch-name origin/branch-name
#First command makes sure you have remote branch in local repository. Second command creates local branch which tracks #remote branch. It assumes that your remote name is origin and branch name is branch-name.

#--track option is enabled by default for remote branches and you can omit it.
