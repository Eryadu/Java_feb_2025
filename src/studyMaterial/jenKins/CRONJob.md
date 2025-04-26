## A CRON job is a scheduled task on Unix/Linux systems that runs automatically at specified intervals — 
using the cron daemon.

🕒 What is Cron?
Cron is a time-based job scheduler. You write cron jobs in a crontab file, which defines what to run and when.

🔹 Cron Syntax
* * * * * command-to-run
          | | | | |
          | | | | +----- Day of week (0 - 7) (Sunday = 0 or 7)
          | | | +------- Month (1 - 12)
          | | +--------- Day of month (1 - 31)
          | +----------- Hour (0 - 23)
          +------------- Minute (0 - 59)
          ✅ Examples

Schedule	                    Cron Expression	        Description
Every minute	                 * * * * *	            Runs every minute
Every day at midnight	         0 0 * * *	            Runs at 00:00 daily
Every Monday at 2am	             0 2 * * 1	            Runs every Monday at 2:00 AM
Every 15 minutes	             */15 * * * *	        Runs every 15 minutes
First of every month	         0 0 1 * *	            Runs on 1st of each month at 00:00

🛠️ How to Create/Edit Cron Jobs
1. Open your crontab:

crontab -e
2. Add a line like:

0 9 * * * /home/user/myscript.sh >> /home/user/log.txt 2>&1
This runs myscript.sh at 9:00 AM daily, and logs output.

3. View scheduled jobs:

crontab -l
4. Remove all cron jobs:

crontab -r
🔒 Important Notes:
Always use full paths in cron (e.g., /usr/bin/python3, not just python3)
Cron runs with limited environment variables (no .bashrc, etc.)
Redirect output (stdout & stderr) to a log file if needed:
>> /path/to/log.txt 2>&1