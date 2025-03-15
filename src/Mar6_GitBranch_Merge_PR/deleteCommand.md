## Deleting a branch in your local Git repository does not automatically delete the corresponding branch on GitHub 
(or any other remote repository). Git and GitHub are separate entities, and changes in your local repository 
(like deleting a branch) do not automatically propagate to the remote repository unless you explicitly push those changes.

What Happens When You Delete a Branch Locally?

git branch -d branch-name
or forcefully:

git branch -D branch-name
it only removes the branch from your local repository. The branch on the remote repository (e.g., GitHub) remains unaffected.

-- How to Delete a Branch on GitHub:

To delete a branch on GitHub, you need to explicitly push the deletion to the remote repository.
Delete the Branch on GitHub:

git push origin --delete branch-name
Alternatively, you can use:
git push origin :branch-name

-- Verify the Deletion:
Check the list of branches on GitHub to ensure the branch has been deleted.
git fetch --prune
This removes references to deleted remote branches in your local repository.
